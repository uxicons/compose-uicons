package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramPredecessor: ImageVector? = null

val Icons.Ss.DiagramPredecessor: ImageVector
    get() = _DiagramPredecessor ?: UXIcon(name = "DiagramPredecessor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 14f)
                lineTo(24f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
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
                moveTo(11f, 2f)
                horizontalLineToRelative(-2.59f)
                lineTo(2.41f, 8f)
                horizontalLineToRelative(3.17f)
                lineTo(11.47f, 2.12f)
                curveToRelative(-0.14f, -0.07f, -0.3f, -0.12f, -0.47f, -0.12f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(2.59f)
                lineToRelative(3.59f, -3.59f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(12f, 8f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-3.59f, 3.59f)
                horizontalLineToRelative(3.59f)
                close()
            }
        }.also { _DiagramPredecessor = it}
