package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSuccessor: ImageVector? = null

val Icons.Ss.DiagramSuccessor: ImageVector
    get() = _DiagramSuccessor ?: UXIcon(name = "DiagramSuccessor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                lineTo(0f, 14f)
                verticalLineToRelative(7f)
                close()
                moveTo(2.06f, 21.35f)
                lineToRelative(5.35f, -5.35f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.43f, 0f, -0.79f, -0.27f, -0.94f, -0.65f)
                close()
                moveTo(13.41f, 16f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6f, -6f)
                close()
                moveTo(21f, 22f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 16.59f)
                lineToRelative(-5.41f, 5.41f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6f, -6f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(4.59f, 16f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(2.59f)
                close()
                moveTo(14f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(11f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.16f, 3.65f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, -3.65f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _DiagramSuccessor = it}
