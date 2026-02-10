package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkeletonRibs: ImageVector? = null

val Icons.Ss.SkeletonRibs: ImageVector
    get() = _SkeletonRibs ?: UXIcon(name = "SkeletonRibs") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                lineTo(0f, 2f)
                verticalLineToRelative(2f)
                lineTo(4.25f, 4f)
                lineTo(1.14f, 17.63f)
                curveToRelative(-0.36f, 1.55f, -0.01f, 3.15f, 0.98f, 4.4f)
                curveToRelative(0.99f, 1.25f, 2.49f, 1.97f, 4.1f, 1.97f)
                horizontalLineToRelative(11.58f)
                curveToRelative(1.6f, 0f, 3.09f, -0.72f, 4.08f, -1.98f)
                curveToRelative(0.99f, -1.25f, 1.35f, -2.87f, 0.99f, -4.42f)
                lineToRelative(-3.11f, -13.6f)
                horizontalLineToRelative(4.25f)
                lineTo(24f, 2f)
                close()
                moveTo(11f, 4f)
                verticalLineToRelative(3f)
                lineTo(5.61f, 7f)
                lineToRelative(0.68f, -3f)
                horizontalLineToRelative(4.7f)
                close()
                moveTo(19.53f, 12f)
                horizontalLineToRelative(-6.53f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.84f)
                lineToRelative(0.69f, 3f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(6.99f)
                lineToRelative(0.69f, 3f)
                horizontalLineToRelative(-7.67f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11f, 17f)
                lineTo(3.34f, 17f)
                lineToRelative(0.68f, -3f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 12f)
                lineTo(4.47f, 12f)
                lineToRelative(0.68f, -3f)
                horizontalLineToRelative(5.84f)
                verticalLineToRelative(3f)
                close()
                moveTo(6.21f, 22f)
                curveToRelative(-0.99f, 0f, -1.92f, -0.44f, -2.53f, -1.21f)
                curveToRelative(-0.41f, -0.52f, -0.63f, -1.14f, -0.66f, -1.79f)
                horizontalLineToRelative(7.98f)
                verticalLineToRelative(3f)
                lineTo(6.21f, 22f)
                close()
                moveTo(17.79f, 22f)
                horizontalLineToRelative(-4.79f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.98f)
                curveToRelative(-0.04f, 0.64f, -0.26f, 1.26f, -0.67f, 1.78f)
                curveToRelative(-0.61f, 0.77f, -1.53f, 1.22f, -2.52f, 1.22f)
                close()
                moveTo(18.39f, 7f)
                horizontalLineToRelative(-5.39f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.7f)
                lineToRelative(0.69f, 3f)
                close()
            }
        }.also { _SkeletonRibs = it}
