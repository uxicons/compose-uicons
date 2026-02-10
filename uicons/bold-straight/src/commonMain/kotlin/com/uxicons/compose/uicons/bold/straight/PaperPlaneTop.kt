package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneTop: ImageVector? = null

val Icons.Bs.PaperPlaneTop: ImageVector
    get() = _PaperPlaneTop ?: UXIcon(name = "PaperPlaneTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.58f, 0.33f)
                curveTo(3.41f, -0.24f, 2.02f, -0.05f, 1.06f, 0.82f)
                curveTo(0.09f, 1.69f, -0.25f, 3.05f, 0.2f, 4.27f)
                lineToRelative(4.11f, 7.73f)
                lineTo(0.28f, 19.73f)
                curveToRelative(-0.45f, 1.23f, -0.1f, 2.58f, 0.86f, 3.45f)
                curveToRelative(0.6f, 0.54f, 1.35f, 0.81f, 2.12f, 0.81f)
                curveToRelative(0.48f, 0f, 0.96f, -0.11f, 1.41f, -0.33f)
                lineToRelative(19.23f, -11.67f)
                lineTo(4.58f, 0.33f)
                close()
                moveTo(3.0f, 3.18f)
                curveToRelative(-0.0f, -0.04f, 0.01f, -0.08f, 0.06f, -0.13f)
                curveToRelative(0.07f, -0.06f, 0.12f, -0.06f, 0.16f, -0.04f)
                lineToRelative(12.4f, 7.49f)
                lineTo(6.9f, 10.5f)
                lineTo(3.0f, 3.18f)
                close()
                moveTo(3.3f, 20.99f)
                curveToRelative(-0.04f, 0.01f, -0.09f, 0.01f, -0.16f, -0.04f)
                curveToRelative(-0.06f, -0.05f, -0.07f, -0.1f, -0.06f, -0.14f)
                lineToRelative(3.83f, -7.31f)
                horizontalLineToRelative(8.73f)
                lineToRelative(-12.34f, 7.49f)
                close()
            }
        }.also { _PaperPlaneTop = it}
