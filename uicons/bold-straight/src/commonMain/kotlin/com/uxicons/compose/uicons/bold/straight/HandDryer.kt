package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDryer: ImageVector? = null

val Icons.Bs.HandDryer: ImageVector
    get() = _HandDryer ?: UXIcon(name = "HandDryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(20f)
                close()
                moveTo(5.0f, 9.11f)
                verticalLineToRelative(-2.11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.69f)
                curveToRelative(-0.83f, -0.82f, -1.87f, -1.36f, -3f, -1.58f)
                close()
                moveTo(1.26f, 12.01f)
                curveToRelative(-1.57f, 1.43f, -1.69f, 3.88f, -0.28f, 5.46f)
                lineToRelative(5.71f, 6.53f)
                horizontalLineToRelative(3.98f)
                reflectiveCurveToRelative(-7.45f, -8.52f, -7.45f, -8.52f)
                curveToRelative(-0.33f, -0.37f, -0.3f, -0.93f, 0.05f, -1.25f)
                curveToRelative(0.35f, -0.33f, 0.93f, -0.3f, 1.25f, 0.06f)
                lineToRelative(3.51f, 3.86f)
                curveToRelative(0.23f, 1.58f, 1.47f, 2.87f, 3.08f, 3.1f)
                lineToRelative(5.16f, 0.74f)
                lineToRelative(0.42f, -2.97f)
                lineToRelative(-5.16f, -0.74f)
                curveToRelative(-0.31f, -0.04f, -0.55f, -0.32f, -0.55f, -0.64f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(8.86f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3.0f)
                reflectiveCurveToRelative(0f, -6.5f, 0f, -6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-8.86f)
                curveToRelative(-0.94f, 0f, -1.79f, 0.37f, -2.44f, 0.96f)
                lineToRelative(-2.45f, -2.69f)
                curveToRelative(-0.7f, -0.77f, -1.65f, -1.22f, -2.69f, -1.26f)
                curveToRelative(-1.04f, -0.05f, -2.03f, 0.31f, -2.8f, 1.01f)
                close()
            }
        }.also { _HandDryer = it}
