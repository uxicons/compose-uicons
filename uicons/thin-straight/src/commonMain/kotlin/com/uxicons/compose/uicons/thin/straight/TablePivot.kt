package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePivot: ImageVector? = null

val Icons.Ts.TablePivot: ImageVector
    get() = _TablePivot ?: UXIcon(name = "TablePivot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(10.5f, 22f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-3.5f)
                lineTo(6f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(13f)
                lineTo(15f, 21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(2.5f)
                lineTo(5f, 7f)
                lineTo(1f, 7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 8f)
                lineTo(5f, 8f)
                verticalLineToRelative(13f)
                close()
                moveTo(6f, 7f)
                lineTo(6f, 3f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                lineTo(6f, 7f)
                close()
                moveTo(16.5f, 19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-5.07f)
                lineToRelative(2.05f, 2.02f)
                lineToRelative(0.7f, -0.71f)
                lineToRelative(-2.43f, -2.4f)
                curveToRelative(-0.44f, -0.44f, -1.21f, -0.44f, -1.64f, -0.0f)
                lineToRelative(-2.44f, 2.4f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(2.05f, -2.02f)
                verticalLineToRelative(5.07f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.08f)
                lineToRelative(2.02f, -2.07f)
                lineToRelative(-0.71f, -0.7f)
                lineToRelative(-2.39f, 2.45f)
                curveToRelative(-0.44f, 0.45f, -0.44f, 1.19f, 0f, 1.64f)
                lineToRelative(2.39f, 2.44f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(-2.02f, -2.07f)
                horizontalLineToRelative(5.08f)
                close()
            }
        }.also { _TablePivot = it}
