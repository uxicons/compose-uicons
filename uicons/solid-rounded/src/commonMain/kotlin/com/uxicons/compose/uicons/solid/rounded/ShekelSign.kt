package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShekelSign: ImageVector? = null

val Icons.Sr.ShekelSign: ImageVector
    get() = _ShekelSign ?: UXIcon(name = "ShekelSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(3f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(9f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                lineTo(14f, 8f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 16f)
                lineTo(22f, 1f)
                curveToRelative(-0.01f, -1.31f, -2.0f, -1.31f, -2f, 0f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(10f, 7f)
                curveToRelative(-0.01f, -1.31f, -2.0f, -1.31f, -2f, 0f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                close()
            }
        }.also { _ShekelSign = it}
