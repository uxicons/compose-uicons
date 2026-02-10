package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramNext: ImageVector? = null

val Icons.Rs.DiagramNext: ImageVector
    get() = _DiagramNext ?: UXIcon(name = "DiagramNext") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                lineTo(5.35f, 14f)
                lineToRelative(1.74f, 2f)
                lineTo(2f, 16f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(21f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5.09f)
                lineToRelative(1.73f, -2f)
                horizontalLineToRelative(5.36f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(7f)
                lineTo(13f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.16f, 3.65f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, -3.65f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                lineTo(0f, 10f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(3.17f)
                lineToRelative(5.35f, -5.35f)
                curveToRelative(-0.14f, -0.38f, -0.51f, -0.65f, -0.94f, -0.65f)
                close()
                moveTo(16.59f, 2f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(3.17f)
                lineToRelative(6f, -6f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(1.59f)
                lineToRelative(2.59f, -2.59f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(2f, 8f)
                horizontalLineToRelative(2.59f)
                lineTo(10.59f, 2f)
                horizontalLineToRelative(-3.17f)
                lineTo(2f, 7.41f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(-2.59f)
                lineToRelative(-2.59f, 2.59f)
                horizontalLineToRelative(2.59f)
                close()
            }
        }.also { _DiagramNext = it}
