package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Ts.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.33f, 0.37f)
                curveToRelative(-0.82f, -0.49f, -1.84f, -0.49f, -2.67f, 0f)
                lineTo(1f, 6.14f)
                verticalLineToRelative(11.72f)
                lineToRelative(9.66f, 5.77f)
                curveToRelative(0.41f, 0.25f, 0.87f, 0.37f, 1.33f, 0.37f)
                reflectiveCurveToRelative(0.92f, -0.12f, 1.33f, -0.37f)
                lineToRelative(9.67f, -5.77f)
                lineTo(23f, 6.14f)
                lineTo(13.33f, 0.37f)
                close()
                moveTo(6.32f, 9.69f)
                lineToRelative(-4.32f, 6.33f)
                lineTo(2f, 7.28f)
                lineToRelative(4.32f, 2.41f)
                close()
                moveTo(12.06f, 1.64f)
                lineToRelative(4.09f, 7.36f)
                lineTo(7.86f, 9f)
                lineTo(12.06f, 1.64f)
                close()
                moveTo(7.86f, 10f)
                horizontalLineToRelative(8.28f)
                lineToRelative(-4.14f, 7.26f)
                lineToRelative(-4.14f, -7.26f)
                close()
                moveTo(6.98f, 10.48f)
                lineToRelative(4.03f, 7.08f)
                lineToRelative(-8.34f, -0.77f)
                lineToRelative(4.3f, -6.31f)
                close()
                moveTo(17.02f, 10.48f)
                lineToRelative(4.41f, 6.31f)
                lineToRelative(-8.44f, 0.75f)
                lineToRelative(4.03f, -7.07f)
                close()
                moveTo(17.68f, 9.69f)
                lineToRelative(4.32f, -2.42f)
                lineTo(22.0f, 15.87f)
                lineToRelative(-4.32f, -6.18f)
                close()
                moveTo(21.5f, 6.41f)
                lineToRelative(-4.31f, 2.41f)
                lineTo(13.05f, 1.37f)
                lineToRelative(8.45f, 5.04f)
                close()
                moveTo(11.12f, 1.26f)
                lineToRelative(-4.3f, 7.56f)
                lineTo(2.5f, 6.41f)
                lineTo(11.12f, 1.26f)
                close()
                moveTo(2.88f, 17.82f)
                lineToRelative(8.62f, 0.79f)
                lineToRelative(0.0f, 4.31f)
                curveToRelative(-0.11f, -0.04f, -0.22f, -0.08f, -0.32f, -0.14f)
                lineTo(2.88f, 17.82f)
                close()
                moveTo(12.82f, 22.77f)
                curveToRelative(-0.1f, 0.06f, -0.21f, 0.1f, -0.32f, 0.14f)
                lineToRelative(-0.0f, -4.32f)
                lineToRelative(8.61f, -0.76f)
                lineToRelative(-8.29f, 4.95f)
                close()
            }
        }.also { _DiceD20 = it}
