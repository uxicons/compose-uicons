package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSittingToilet: ImageVector? = null

val Icons.Ts.UserSittingToilet: ImageVector
    get() = _UserSittingToilet ?: UXIcon(name = "UserSittingToilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(15.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.52f, 15f)
                horizontalLineToRelative(-4.66f)
                lineToRelative(1.79f, -5.76f)
                lineToRelative(3.95f, 5.55f)
                lineToRelative(0.81f, -0.58f)
                lineToRelative(-5.08f, -7.14f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.37f, -0.54f, -0.93f, -0.91f, -1.58f, -1.04f)
                curveToRelative(-1.26f, -0.29f, -2.7f, 0.66f, -2.91f, 1.91f)
                lineToRelative(-1.79f, 5.08f)
                curveToRelative(-0.33f, 1.49f, 0.93f, 3.01f, 2.46f, 2.97f)
                horizontalLineToRelative(7.01f)
                curveToRelative(0.31f, -0.01f, 0.57f, 0.31f, 0.49f, 0.61f)
                lineToRelative(-1.68f, 7.12f)
                lineToRelative(0.97f, 0.23f)
                lineToRelative(1.68f, -7.12f)
                curveToRelative(0.24f, -0.91f, -0.52f, -1.87f, -1.46f, -1.84f)
                close()
                moveTo(11.5f, 15f)
                curveToRelative(-0.88f, 0.04f, -1.66f, -0.9f, -1.49f, -1.71f)
                lineToRelative(1.79f, -5.08f)
                curveToRelative(0.14f, -0.8f, 0.97f, -1.36f, 1.76f, -1.19f)
                curveToRelative(0.77f, 0.12f, 1.35f, 0.97f, 1.2f, 1.71f)
                lineToRelative(-1.95f, 6.28f)
                close()
                moveTo(5.0f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(16f)
                lineToRelative(5.99f, -0.0f)
                lineToRelative(0.01f, -0.49f)
                curveToRelative(0.0f, -0.25f, 0.09f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(4.94f, 0f, 5f, -4.46f, 5f, -4.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(12.0f, 21f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.64f, 0f, -2.28f, 1.12f, -2.45f, 2f)
                horizontalLineToRelative(-4.05f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10.95f)
                curveToRelative(-0.17f, 0.97f, -0.89f, 3f, -3.95f, 3f)
                close()
            }
        }.also { _UserSittingToilet = it}
