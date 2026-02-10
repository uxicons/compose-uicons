package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Rc.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.14f, 14.72f)
                curveToRelative(-1.99f, -4.59f, -4.89f, -8.98f, -8.61f, -13.05f)
                curveToRelative(-0.78f, -0.85f, -2.28f, -0.85f, -3.06f, 0f)
                curveTo(6.75f, 5.75f, 3.86f, 10.14f, 1.86f, 14.72f)
                curveToRelative(-0.15f, 0.34f, -0.1f, 0.73f, 0.14f, 1.02f)
                lineToRelative(0.12f, 0.15f)
                curveToRelative(2.41f, 2.98f, 5.69f, 5.41f, 9.49f, 7.03f)
                curveToRelative(0.12f, 0.05f, 0.26f, 0.08f, 0.39f, 0.08f)
                reflectiveCurveToRelative(0.27f, -0.03f, 0.39f, -0.08f)
                curveToRelative(3.8f, -1.62f, 7.08f, -4.04f, 9.49f, -7.03f)
                lineToRelative(0.12f, -0.14f)
                curveToRelative(0.23f, -0.29f, 0.29f, -0.68f, 0.14f, -1.02f)
                close()
                moveTo(3.95f, 14.96f)
                curveToRelative(1.72f, -3.79f, 4.08f, -7.44f, 7.05f, -10.88f)
                lineTo(11.0f, 20.43f)
                curveToRelative(-2.75f, -1.39f, -5.21f, -3.29f, -7.05f, -5.47f)
                close()
                moveTo(13.0f, 20.43f)
                lineTo(13.0f, 4.08f)
                curveToRelative(2.97f, 3.44f, 5.34f, 7.09f, 7.05f, 10.88f)
                curveToRelative(-1.85f, 2.18f, -4.3f, 4.08f, -7.05f, 5.47f)
                close()
            }
        }.also { _DiceD4 = it}
