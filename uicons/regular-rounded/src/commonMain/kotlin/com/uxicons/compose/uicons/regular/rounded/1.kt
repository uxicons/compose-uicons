package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rr1: ImageVector? = null

val Icons.Rr.Rr1: ImageVector
    get() = _Rr1 ?: UXIcon(name = "Rr1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(2.01f)
                lineToRelative(-5.21f, 6.61f)
                curveToRelative(-0.34f, 0.43f, -0.97f, 0.51f, -1.41f, 0.17f)
                curveToRelative(-0.43f, -0.34f, -0.51f, -0.97f, -0.17f, -1.41f)
                curveToRelative(0f, 0f, 5.34f, -6.77f, 5.37f, -6.79f)
                curveTo(11.16f, 0.01f, 12.02f, -0.16f, 12.77f, 0.15f)
                curveToRelative(0.75f, 0.31f, 1.23f, 1.04f, 1.23f, 1.85f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Rr1 = it}
