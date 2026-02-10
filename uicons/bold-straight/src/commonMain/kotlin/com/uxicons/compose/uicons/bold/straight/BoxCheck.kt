package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Bs.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.46f, 15.58f)
                lineToRelative(2.09f, -2.15f)
                lineToRelative(2.45f, 2.38f)
                lineToRelative(4.45f, -4.37f)
                lineToRelative(2.1f, 2.14f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-2.78f, -2.69f)
                close()
                moveTo(24f, 10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(14f)
                lineTo(1f, 24f)
                lineTo(1f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(3f, 7f)
                lineTo(21f, 7f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(20f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(11f)
                lineTo(20f, 21f)
                lineTo(20f, 10f)
                close()
            }
        }.also { _BoxCheck = it}
