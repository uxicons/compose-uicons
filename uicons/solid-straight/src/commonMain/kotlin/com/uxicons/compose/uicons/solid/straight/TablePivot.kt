package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePivot: ImageVector? = null

val Icons.Ss.TablePivot: ImageVector
    get() = _TablePivot ?: UXIcon(name = "TablePivot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                verticalLineToRelative(14f)
                lineTo(24f, 22f)
                lineTo(24f, 8f)
                lineTo(6f, 8f)
                close()
                moveTo(19f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2.71f, -2.79f)
                curveToRelative(-0.38f, -0.39f, -0.38f, -1.02f, 0f, -1.42f)
                lineToRelative(2.71f, -2.79f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(2.76f, -2.71f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                lineToRelative(2.76f, 2.71f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(2.02f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(15f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(6f, 6f)
                lineTo(6f, 2f)
                close()
                moveTo(0f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                lineTo(4f, 6f)
                lineTo(0f, 6f)
                close()
                moveTo(4f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 8f)
                lineTo(4f, 8f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _TablePivot = it}
