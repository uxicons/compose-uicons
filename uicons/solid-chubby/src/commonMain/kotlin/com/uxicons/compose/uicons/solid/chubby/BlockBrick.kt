package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockBrick: ImageVector? = null

val Icons.Sc.BlockBrick: ImageVector
    get() = _BlockBrick ?: UXIcon(name = "BlockBrick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.0f, 7.49f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-6.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.01f, 10.99f)
                horizontalLineToRelative(5.99f)
                curveToRelative(-0.04f, -1.28f, -0.14f, -2.46f, -0.27f, -3.5f)
                horizontalLineToRelative(-5.73f)
                verticalLineToRelative(3.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.0f, 12.99f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(0.04f, 1.28f, 0.14f, 2.46f, 0.27f, 3.5f)
                horizontalLineToRelative(9.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12.99f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(9.73f)
                curveToRelative(0.13f, -1.04f, 0.23f, -2.23f, 0.27f, -3.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 10.99f)
                horizontalLineToRelative(5.99f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-5.72f)
                curveToRelative(-0.13f, 1.04f, -0.23f, 2.23f, -0.27f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.0f, 5.49f)
                horizontalLineToRelative(9.43f)
                curveToRelative(-0.29f, -1.59f, -0.58f, -2.56f, -0.61f, -2.64f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.16f, -0.04f, -3.73f, -1.03f, -8.13f, -1.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.03f, 18.5f)
                lineToRelative(-0.02f, 4.13f)
                curveToRelative(2.38f, -0.34f, 4.01f, -0.79f, 4.12f, -0.82f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.02f, -0.08f, 0.32f, -1.06f, 0.6f, -2.64f)
                horizontalLineToRelative(-5.39f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.03f, 18.5f)
                horizontalLineToRelative(-6.03f)
                verticalLineToRelative(4.37f)
                curveToRelative(0.94f, 0.08f, 1.96f, 0.14f, 3.0f, 0.14f)
                reflectiveCurveToRelative(2.06f, -0.05f, 3.01f, -0.14f)
                lineToRelative(0.02f, -4.37f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.0f, 5.49f)
                verticalLineToRelative(-4.49f)
                curveToRelative(-4.4f, 0.14f, -7.97f, 1.13f, -8.13f, 1.17f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.02f, 0.08f, -0.32f, 1.06f, -0.6f, 2.64f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.99f, 18.5f)
                horizontalLineToRelative(-5.42f)
                curveToRelative(0.29f, 1.59f, 0.58f, 2.56f, 0.61f, 2.64f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.11f, 0.03f, 1.74f, 0.48f, 4.13f, 0.82f)
                verticalLineToRelative(-4.14f)
                close()
            }
        }.also { _BlockBrick = it}
