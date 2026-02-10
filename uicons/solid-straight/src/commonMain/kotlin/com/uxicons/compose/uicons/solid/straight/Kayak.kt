package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kayak: ImageVector? = null

val Icons.Ss.Kayak: ImageVector
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
                curveToRelative(0f, -0.86f, 0.43f, -3.22f, 1.5f, -4.97f)
                verticalLineToRelative(-1.03f)
                horizontalLineToRelative(-5.43f)
                curveToRelative(0.09f, -1.34f, 0.25f, -2.53f, 0.41f, -3.48f)
                lineToRelative(0.98f, 1.48f)
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
                verticalLineToRelative(1.03f)
                curveToRelative(0.96f, 1.56f, 1.4f, 3.61f, 1.48f, 4.64f)
                curveToRelative(0f, 0f, 0.0f, 0f, 0.0f, 0.0f)
                lineToRelative(2.52f, -3.77f)
                verticalLineToRelative(-1.9f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Kayak = it}
