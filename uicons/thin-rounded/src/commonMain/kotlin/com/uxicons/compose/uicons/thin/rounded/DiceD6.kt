package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Tr.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.72f, 4.43f)
                lineTo(14.42f, 0.67f)
                curveToRelative(-1.49f, -0.89f, -3.34f, -0.89f, -4.83f, 0f)
                lineTo(3.28f, 4.43f)
                curveToRelative(-1.41f, 0.84f, -2.28f, 2.38f, -2.28f, 4.02f)
                verticalLineToRelative(7.11f)
                curveToRelative(0f, 1.64f, 0.88f, 3.17f, 2.28f, 4.02f)
                lineToRelative(6.3f, 3.76f)
                curveToRelative(0.75f, 0.44f, 1.58f, 0.67f, 2.42f, 0.67f)
                reflectiveCurveToRelative(1.67f, -0.22f, 2.42f, -0.67f)
                lineToRelative(6.3f, -3.77f)
                curveToRelative(1.41f, -0.84f, 2.28f, -2.38f, 2.28f, -4.01f)
                verticalLineToRelative(-7.11f)
                curveToRelative(0f, -1.64f, -0.88f, -3.17f, -2.28f, -4.02f)
                close()
                moveTo(3.79f, 5.29f)
                lineTo(10.1f, 1.52f)
                curveToRelative(1.18f, -0.7f, 2.63f, -0.7f, 3.81f, 0f)
                lineToRelative(6.3f, 3.76f)
                curveToRelative(0.41f, 0.25f, 0.77f, 0.57f, 1.05f, 0.94f)
                lineToRelative(-9.25f, 5.2f)
                lineTo(2.75f, 6.23f)
                curveToRelative(0.28f, -0.37f, 0.64f, -0.7f, 1.05f, -0.94f)
                close()
                moveTo(3.79f, 18.71f)
                curveToRelative(-1.11f, -0.66f, -1.79f, -1.87f, -1.79f, -3.16f)
                verticalLineToRelative(-7.11f)
                curveToRelative(0f, -0.47f, 0.09f, -0.92f, 0.26f, -1.34f)
                lineToRelative(9.24f, 5.19f)
                verticalLineToRelative(10.68f)
                curveToRelative(-0.49f, -0.07f, -0.97f, -0.23f, -1.4f, -0.49f)
                lineToRelative(-6.3f, -3.76f)
                close()
                moveTo(22f, 15.55f)
                curveToRelative(0f, 1.28f, -0.69f, 2.5f, -1.8f, 3.16f)
                lineToRelative(-6.3f, 3.76f)
                curveToRelative(-0.44f, 0.26f, -0.92f, 0.43f, -1.41f, 0.49f)
                lineTo(12.5f, 12.29f)
                lineToRelative(9.24f, -5.19f)
                curveToRelative(0.17f, 0.42f, 0.26f, 0.88f, 0.26f, 1.34f)
                verticalLineToRelative(7.11f)
                close()
            }
        }.also { _DiceD6 = it}
