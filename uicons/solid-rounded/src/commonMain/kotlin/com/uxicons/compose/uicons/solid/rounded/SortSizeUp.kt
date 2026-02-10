package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeUp: ImageVector? = null

val Icons.Sr.SortSizeUp: ImageVector
    get() = _SortSizeUp ?: UXIcon(name = "SortSizeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8.12f, 0.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.22f, -0.02f)
                lineTo(0.31f, 4.28f)
                curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f)
                curveToRelative(0.38f, 0.4f, 1.01f, 0.42f, 1.41f, 0.03f)
                lineToRelative(3.31f, -3.15f)
                lineTo(4.99f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(6.99f, 2.57f)
                lineToRelative(3.31f, 3.15f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.28f, 0.69f, 0.28f)
                curveToRelative(0.26f, 0f, 0.53f, -0.1f, 0.72f, -0.31f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.04f, -1.41f)
                lineTo(8.12f, 0.88f)
                close()
            }
        }.also { _SortSizeUp = it}
