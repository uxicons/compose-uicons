package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustraliaCountryCode: ImageVector? = null

val Icons.Ts.AustraliaCountryCode: ImageVector
    get() = _AustraliaCountryCode ?: UXIcon(name = "AustraliaCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 8f)
                curveToRelative(-0.69f, -0.02f, -1.32f, 0.51f, -1.46f, 1.2f)
                lineToRelative(-1.54f, 6.8f)
                horizontalLineToRelative(1.03f)
                lineToRelative(0.45f, -2f)
                horizontalLineToRelative(3.04f)
                lineToRelative(0.45f, 2f)
                horizontalLineToRelative(1.03f)
                lineToRelative(-1.56f, -6.85f)
                curveToRelative(-0.16f, -0.67f, -0.75f, -1.15f, -1.44f, -1.15f)
                close()
                moveTo(7.21f, 13f)
                lineToRelative(0.81f, -3.58f)
                curveToRelative(0.09f, -0.55f, 0.83f, -0.55f, 0.95f, -0.05f)
                lineToRelative(0.82f, 3.62f)
                horizontalLineToRelative(-2.58f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(24f, 21f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
            }
        }.also { _AustraliaCountryCode = it}
