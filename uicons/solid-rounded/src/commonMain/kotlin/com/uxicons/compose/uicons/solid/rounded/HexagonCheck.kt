package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonCheck: ImageVector? = null

val Icons.Sr.HexagonCheck: ImageVector
    get() = _HexagonCheck ?: UXIcon(name = "HexagonCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.36f, 9.48f)
                lineToRelative(-3.5f, -6f)
                curveToRelative(-0.89f, -1.53f, -2.55f, -2.48f, -4.32f, -2.48f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(-1.77f, 0f, -3.43f, 0.95f, -4.32f, 2.48f)
                lineTo(0.65f, 9.48f)
                curveToRelative(-0.91f, 1.55f, -0.91f, 3.48f, 0f, 5.04f)
                lineToRelative(3.5f, 6f)
                curveToRelative(0.89f, 1.53f, 2.55f, 2.48f, 4.32f, 2.48f)
                horizontalLineToRelative(7.07f)
                curveToRelative(1.77f, 0f, 3.43f, -0.95f, 4.32f, -2.48f)
                lineToRelative(3.5f, -6f)
                curveToRelative(0.91f, -1.55f, 0.91f, -3.48f, 0f, -5.04f)
                close()
                moveTo(18.2f, 10.51f)
                lineToRelative(-4.43f, 4.34f)
                curveToRelative(-0.78f, 0.77f, -1.79f, 1.15f, -2.8f, 1.15f)
                curveToRelative(-1.0f, 0f, -2.0f, -0.38f, -2.78f, -1.13f)
                lineToRelative(-1.9f, -1.87f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.89f, 1.86f)
                curveToRelative(0.78f, 0.75f, 2.0f, 0.75f, 2.78f, -0.02f)
                lineToRelative(4.42f, -4.34f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.38f, 1.41f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                close()
            }
        }.also { _HexagonCheck = it}
