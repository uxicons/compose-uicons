package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustraliaCountryCode: ImageVector? = null

val Icons.Ss.AustraliaCountryCode: ImageVector
    get() = _AustraliaCountryCode ?: UXIcon(name = "AustraliaCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                lineTo(24f, 21f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.17f, 16.01f)
                lineToRelative(-0.31f, -1.41f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(-0.32f, 1.41f)
                horizontalLineToRelative(-1.68f)
                lineToRelative(1.48f, -6.42f)
                curveToRelative(0.18f, -0.88f, 0.98f, -1.59f, 1.88f, -1.58f)
                curveToRelative(0.93f, -0.0f, 1.69f, 0.67f, 1.9f, 1.63f)
                lineToRelative(1.45f, 6.37f)
                horizontalLineToRelative(-1.69f)
                close()
                moveTo(18f, 13.43f)
                curveToRelative(0f, 1.42f, -1.15f, 2.57f, -2.57f, 2.57f)
                reflectiveCurveToRelative(-2.57f, -1.15f, -2.57f, -2.57f)
                verticalLineToRelative(-5.43f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(5.43f)
                curveToRelative(0f, 0.54f, 0.44f, 0.97f, 0.97f, 0.97f)
                reflectiveCurveToRelative(0.97f, -0.44f, 0.97f, -0.97f)
                verticalLineToRelative(-5.43f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(5.43f)
                close()
                moveTo(8.85f, 9.99f)
                lineToRelative(0.66f, 3.01f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.69f, -3.07f)
                curveToRelative(0.1f, -0.41f, 0.57f, -0.45f, 0.65f, 0.06f)
                close()
            }
        }.also { _AustraliaCountryCode = it}
