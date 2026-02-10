package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramNext: ImageVector? = null

val Icons.Ss.DiagramNext: ImageVector
    get() = _DiagramNext ?: UXIcon(name = "DiagramNext") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(7f)
                lineTo(11f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.18f, 3.65f)
                curveToRelative(0.44f, 0.49f, 1.22f, 0.49f, 1.66f, 0f)
                lineToRelative(3.16f, -3.65f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(21.94f, 2.65f)
                lineToRelative(-5.35f, 5.35f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6f, -6f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.43f, 0f, 0.79f, 0.27f, 0.94f, 0.65f)
                close()
                moveTo(10.59f, 8f)
                horizontalLineToRelative(-3.17f)
                lineTo(13.41f, 2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6f, 6f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 7.41f)
                lineTo(7.41f, 2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6f, 6f)
                lineTo(2f, 8f)
                verticalLineToRelative(-0.59f)
                close()
                moveTo(19.41f, 8f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-2.59f)
                close()
                moveTo(18.64f, 14f)
                horizontalLineToRelative(5.36f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                lineTo(5.35f, 14f)
                lineToRelative(4.35f, 4.99f)
                curveToRelative(0.59f, 0.66f, 1.43f, 1.03f, 2.32f, 1.03f)
                horizontalLineToRelative(0f)
                curveToRelative(0.88f, 0f, 1.73f, -0.38f, 2.34f, -1.06f)
                lineToRelative(4.29f, -4.96f)
                close()
            }
        }.also { _DiagramNext = it}
