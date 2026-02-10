package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Sr.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-1.14f, 0f, -2.17f, -0.64f, -2.68f, -1.66f)
                lineTo(10.5f, 2.76f)
                curveToRelative(-0.85f, -1.71f, -2.57f, -2.76f, -4.47f, -2.76f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.03f)
                curveToRelative(1.14f, 0f, 2.17f, 0.64f, 2.68f, 1.66f)
                lineToRelative(1.57f, 3.15f)
                lineTo(2.11f, 22.54f)
                curveToRelative(-0.25f, 0.49f, -0.06f, 1.09f, 0.43f, 1.35f)
                curveToRelative(0.15f, 0.08f, 0.3f, 0.11f, 0.46f, 0.11f)
                curveToRelative(0.36f, 0f, 0.71f, -0.2f, 0.89f, -0.54f)
                lineToRelative(7.5f, -14.44f)
                lineToRelative(6.11f, 12.22f)
                curveToRelative(0.85f, 1.71f, 2.57f, 2.76f, 4.47f, 2.76f)
                horizontalLineToRelative(1.03f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Lambda = it}
