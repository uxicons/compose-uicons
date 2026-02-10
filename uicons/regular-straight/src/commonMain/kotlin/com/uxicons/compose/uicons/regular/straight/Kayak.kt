package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kayak: ImageVector? = null

val Icons.Rs.Kayak: ImageVector
    get() = _Kayak ?: UXIcon(name = "Kayak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(9.04f, 9f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(-1.43f, 0f, -2.67f, 1.02f, -2.94f, 2.42f)
                curveToRelative(-0.22f, 1.12f, -0.47f, 2.72f, -0.59f, 4.58f)
                lineTo(0f, 16f)
                verticalLineToRelative(1.9f)
                lineToRelative(2.69f, 4.03f)
                curveToRelative(0.86f, 1.3f, 2.31f, 2.07f, 3.87f, 2.07f)
                horizontalLineToRelative(6.5f)
                curveToRelative(-0.34f, -0.58f, -0.55f, -1.25f, -0.55f, -2f)
                lineTo(6.55f, 22.0f)
                curveToRelative(-0.89f, 0f, -1.71f, -0.44f, -2.21f, -1.18f)
                lineToRelative(-1.88f, -2.82f)
                lineTo(14f, 18.0f)
                verticalLineToRelative(-2f)
                lineTo(6.07f, 16.0f)
                curveToRelative(0.11f, -1.7f, 0.34f, -3.17f, 0.54f, -4.2f)
                curveToRelative(0.09f, -0.47f, 0.51f, -0.8f, 0.98f, -0.8f)
                horizontalLineToRelative(0.37f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(4.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.96f)
                lineToRelative(-2f, -3f)
                close()
                moveTo(19.5f, 2f)
                curveToRelative(0f, -1.38f, -1.12f, -2f, -2.5f, -2f)
                reflectiveCurveToRelative(-2.5f, 0.62f, -2.5f, 2f)
                curveToRelative(0f, 1.02f, 0.62f, 3.28f, 1.5f, 4.38f)
                verticalLineToRelative(11.25f)
                curveToRelative(-0.88f, 1.1f, -1.5f, 3.35f, -1.5f, 4.38f)
                curveToRelative(0f, 1.38f, 1.12f, 2f, 2.5f, 2f)
                reflectiveCurveToRelative(2.5f, -0.62f, 2.5f, -2f)
                curveToRelative(0f, -1.02f, -0.62f, -3.28f, -1.5f, -4.38f)
                lineTo(18f, 6.38f)
                curveToRelative(0.88f, -1.1f, 1.5f, -3.35f, 1.5f, -4.38f)
                close()
                moveTo(20f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.53f)
                lineToRelative(-0.65f, 0.97f)
                curveToRelative(0.36f, 1.05f, 0.55f, 2.07f, 0.6f, 2.71f)
                lineToRelative(2.52f, -3.77f)
                verticalLineToRelative(-1.9f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Kayak = it}
