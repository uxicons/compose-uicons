package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitRightAndLeft: ImageVector? = null

val Icons.Tr.ArrowsSplitRightAndLeft: ImageVector
    get() = _ArrowsSplitRightAndLeft ?: UXIcon(name = "ArrowsSplitRightAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 6.56f)
                lineToRelative(-4.2f, 4.29f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                lineToRelative(4.07f, -4.15f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(11.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(1.29f)
                lineToRelative(4.07f, 4.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.01f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.22f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.36f, -0.15f)
                lineTo(0.44f, 6.56f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.64f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.15f, -0.78f, 0.44f, -1.06f)
                lineTo(4.64f, 0.15f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                lineTo(1.29f, 5f)
                horizontalLineTo(6f)
                curveToRelative(2.7f, 0f, 5.02f, 1.65f, 6f, 4f)
                curveToRelative(0.98f, -2.35f, 3.3f, -4f, 6f, -4f)
                horizontalLineToRelative(4.71f)
                lineTo(18.64f, 0.85f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.01f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.01f)
                lineToRelative(4.21f, 4.29f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.63f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.15f, 0.78f, -0.44f, 1.06f)
                close()
            }
        }.also { _ArrowsSplitRightAndLeft = it}
