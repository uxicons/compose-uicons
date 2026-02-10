package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkeletonRibs: ImageVector? = null

val Icons.Bs.SkeletonRibs: ImageVector
    get() = _SkeletonRibs ?: UXIcon(name = "SkeletonRibs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(13.5f, 3f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 3f)
                lineTo(0f, 3f)
                verticalLineToRelative(3f)
                lineTo(3.8f, 6f)
                lineTo(1.15f, 17.27f)
                curveToRelative(-0.39f, 1.65f, -0.01f, 3.35f, 1.04f, 4.67f)
                curveToRelative(1.05f, 1.32f, 2.62f, 2.08f, 4.32f, 2.08f)
                lineToRelative(10.99f, -0.03f)
                curveToRelative(1.69f, 0f, 3.26f, -0.76f, 4.31f, -2.08f)
                reflectiveCurveToRelative(1.43f, -3.03f, 1.04f, -4.67f)
                lineToRelative(-2.64f, -11.24f)
                horizontalLineToRelative(3.79f)
                lineTo(24.0f, 3f)
                close()
                moveTo(10.5f, 21.02f)
                lineToRelative(-4.0f, 0.01f)
                curveToRelative(-0.77f, 0f, -1.48f, -0.35f, -1.96f, -0.95f)
                curveToRelative(-0.47f, -0.59f, -0.64f, -1.35f, -0.48f, -2.08f)
                horizontalLineToRelative(6.44f)
                verticalLineToRelative(3.02f)
                close()
                moveTo(10.5f, 15f)
                lineTo(4.76f, 15f)
                lineToRelative(0.71f, -3f)
                horizontalLineToRelative(5.03f)
                verticalLineToRelative(3f)
                close()
                moveTo(10.5f, 9f)
                lineTo(6.18f, 9f)
                lineToRelative(0.71f, -3f)
                horizontalLineToRelative(3.62f)
                verticalLineToRelative(3f)
                close()
                moveTo(13.5f, 6f)
                horizontalLineToRelative(3.63f)
                lineToRelative(0.71f, 3f)
                horizontalLineToRelative(-4.33f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13.5f, 12f)
                horizontalLineToRelative(5.04f)
                lineToRelative(0.71f, 3f)
                horizontalLineToRelative(-5.75f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19.46f, 20.05f)
                curveToRelative(-0.48f, 0.6f, -1.19f, 0.95f, -1.96f, 0.95f)
                lineToRelative(-4.0f, 0.01f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(6.44f)
                curveToRelative(0.15f, 0.72f, -0.02f, 1.47f, -0.48f, 2.05f)
                close()
            }
        }.also { _SkeletonRibs = it}
