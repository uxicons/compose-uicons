package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePivot: ImageVector? = null

val Icons.Bs.TablePivot: ImageVector
    get() = _TablePivot ?: UXIcon(name = "TablePivot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 14f)
                horizontalLineToRelative(-1.96f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                lineToRelative(-2.71f, -2.79f)
                curveToRelative(-0.38f, -0.39f, -0.38f, -1.02f, 0f, -1.42f)
                lineToRelative(2.71f, -2.79f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(2.76f, -2.71f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                lineToRelative(2.76f, 2.71f)
                close()
                moveTo(20.5f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2.03f)
                curveToRelative(0.65f, 0.07f, 1.28f, 0.34f, 1.77f, 0.84f)
                lineToRelative(1.23f, 1.21f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(11.21f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(12f)
                lineTo(13.37f, 22f)
                lineToRelative(-1.36f, -1.4f)
                curveToRelative(-0.44f, -0.45f, -0.7f, -1.01f, -0.8f, -1.6f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(-1.5f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(5f, 7f)
                lineTo(5f, 2f)
                close()
            }
        }.also { _TablePivot = it}
