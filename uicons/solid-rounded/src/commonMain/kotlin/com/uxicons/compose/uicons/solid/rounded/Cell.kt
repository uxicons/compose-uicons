package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Sr.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4.65f)
                verticalLineToRelative(2.83f)
                curveToRelative(0f, 1.25f, -0.67f, 2.41f, -1.75f, 3.03f)
                lineToRelative(-2f, 1.15f)
                curveToRelative(-1.08f, 0.62f, -2.42f, 0.62f, -3.5f, 0f)
                lineToRelative(-2f, -1.15f)
                curveToRelative(-1.08f, -0.62f, -1.75f, -1.78f, -1.75f, -3.03f)
                verticalLineToRelative(-2.83f)
                curveToRelative(-0.0f, -1.25f, 0.67f, -2.41f, 1.75f, -3.03f)
                lineToRelative(2f, -1.15f)
                curveToRelative(1.08f, -0.62f, 2.42f, -0.62f, 3.5f, 0f)
                lineToRelative(2f, 1.15f)
                curveToRelative(1.08f, 0.62f, 1.75f, 1.78f, 1.75f, 3.03f)
                close()
                moveTo(22.25f, 1.62f)
                lineTo(20.25f, 0.47f)
                curveToRelative(-1.08f, -0.62f, -2.42f, -0.62f, -3.5f, 0f)
                lineToRelative(-2f, 1.15f)
                curveToRelative(-1.08f, 0.62f, -1.75f, 1.78f, -1.75f, 3.03f)
                verticalLineToRelative(2.83f)
                curveToRelative(0f, 1.25f, 0.67f, 2.41f, 1.75f, 3.03f)
                lineToRelative(2f, 1.15f)
                curveToRelative(1.08f, 0.62f, 2.42f, 0.62f, 3.5f, 0f)
                lineToRelative(2f, -1.15f)
                curveToRelative(1.08f, -0.62f, 1.75f, -1.78f, 1.75f, -3.03f)
                verticalLineToRelative(-2.83f)
                curveToRelative(0f, -1.25f, -0.67f, -2.41f, -1.75f, -3.03f)
                close()
                moveTo(8.04f, 13.45f)
                curveToRelative(-1.1f, 0.64f, -1.77f, 1.82f, -1.75f, 3.09f)
                lineToRelative(0.04f, 2.54f)
                curveToRelative(0f, 1.25f, 0.67f, 2.41f, 1.75f, 3.03f)
                lineToRelative(2.46f, 1.42f)
                curveToRelative(1.13f, 0.65f, 2.54f, 0.62f, 3.64f, -0.09f)
                lineToRelative(2.04f, -1.31f)
                curveToRelative(1.0f, -0.64f, 1.61f, -1.75f, 1.61f, -2.95f)
                lineToRelative(-0.04f, -2.73f)
                curveToRelative(-0.02f, -1.23f, -0.69f, -2.36f, -1.75f, -2.98f)
                lineToRelative(-2.28f, -1.32f)
                curveToRelative(-1.08f, -0.62f, -2.42f, -0.62f, -3.5f, 0f)
                lineToRelative(-2.22f, 1.28f)
                close()
            }
        }.also { _Cell = it}
