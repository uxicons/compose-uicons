package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Sc.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.43f, 14.8f)
                curveToRelative(-2.05f, -4.72f, -5.03f, -9.24f, -8.85f, -13.43f)
                curveToRelative(-0.16f, -0.17f, -0.34f, -0.31f, -0.55f, -0.41f)
                verticalLineTo(22.96f)
                curveToRelative(3.65f, -1.66f, 6.79f, -4.05f, 9.14f, -6.95f)
                lineToRelative(0.12f, -0.15f)
                curveToRelative(0.24f, -0.3f, 0.29f, -0.7f, 0.14f, -1.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.43f, 1.38f)
                curveTo(6.6f, 5.57f, 3.62f, 10.08f, 1.57f, 14.8f)
                curveToRelative(-0.15f, 0.35f, -0.1f, 0.76f, 0.14f, 1.05f)
                lineToRelative(0.12f, 0.15f)
                curveToRelative(2.34f, 2.9f, 5.49f, 5.29f, 9.14f, 6.95f)
                verticalLineTo(0.96f)
                curveToRelative(-0.2f, 0.1f, -0.39f, 0.24f, -0.55f, 0.41f)
                close()
            }
        }.also { _DiceD4 = it}
