package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleUp: ImageVector? = null

val Icons.Tr.ChevronDoubleUp: ImageVector
    get() = _ChevronDoubleUp ?: UXIcon(name = "ChevronDoubleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.47f, 2.02f)
                curveToRelative(-1.32f, -1.32f, -3.63f, -1.32f, -4.95f, -0.0f)
                lineTo(0.15f, 11.32f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.0f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineTo(10.23f, 2.73f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.95f, 3.54f, 0.0f)
                lineToRelative(9.38f, 9.29f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                lineTo(14.47f, 2.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.77f, 11.73f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.53f, -0.0f)
                lineTo(0.15f, 21.64f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0.01f)
                lineTo(10.94f, 12.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0.0f)
                lineToRelative(10.09f, 9.91f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                lineTo(13.77f, 11.73f)
                close()
            }
        }.also { _ChevronDoubleUp = it}
