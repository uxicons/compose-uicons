package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConstructionHelmet: ImageVector? = null

val Icons.Rr.ConstructionHelmet: ImageVector
    get() = _ConstructionHelmet ?: UXIcon(name = "ConstructionHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 16f)
                verticalLineToRelative(-3.45f)
                curveToRelative(0.0f, -4.85f, -3.38f, -9.2f, -8.19f, -10.39f)
                curveToRelative(-0.72f, -0.72f, -1.72f, -1.16f, -2.81f, -1.16f)
                reflectiveCurveToRelative(-2.09f, 0.44f, -2.81f, 1.16f)
                curveToRelative(-4.81f, 1.19f, -8.19f, 5.54f, -8.19f, 10.39f)
                verticalLineToRelative(3.45f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.98f)
                lineToRelative(1.11f, 1.59f)
                curveToRelative(1.5f, 2.14f, 3.94f, 3.41f, 6.55f, 3.41f)
                horizontalLineToRelative(4.71f)
                curveToRelative(2.61f, 0f, 5.06f, -1.28f, 6.55f, -3.41f)
                lineToRelative(1.11f, -1.59f)
                horizontalLineToRelative(0.98f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(3f, 12.55f)
                curveToRelative(0f, -3.38f, 2.0f, -6.41f, 5.03f, -7.86f)
                curveToRelative(-0.01f, 0.1f, -0.03f, 0.2f, -0.03f, 0.3f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.01f)
                curveToRelative(0f, -1.1f, 0.9f, -1.99f, 2f, -1.99f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 1.99f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.01f)
                curveToRelative(0f, -0.1f, -0.02f, -0.2f, -0.03f, -0.3f)
                curveToRelative(3.03f, 1.45f, 5.03f, 4.48f, 5.03f, 7.86f)
                verticalLineToRelative(3.45f)
                horizontalLineToRelative(-18f)
                close()
                moveTo(14.36f, 21f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-1.96f, 0f, -3.79f, -0.96f, -4.92f, -2.56f)
                lineToRelative(-0.31f, -0.44f)
                horizontalLineToRelative(15.16f)
                lineToRelative(-0.31f, 0.44f)
                curveToRelative(-1.12f, 1.6f, -2.96f, 2.56f, -4.92f, 2.56f)
                close()
            }
        }.also { _ConstructionHelmet = it}
