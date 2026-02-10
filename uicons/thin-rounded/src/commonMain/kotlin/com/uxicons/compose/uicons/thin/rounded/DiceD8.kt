package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Tr.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.89f, 8.98f)
                lineTo(14.73f, 1.23f)
                curveTo(14.04f, 0.45f, 13.04f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(0f)
                curveTo(10.96f, 0.0f, 9.96f, 0.45f, 9.27f, 1.22f)
                lineTo(2.1f, 8.99f)
                curveToRelative(-1.47f, 1.74f, -1.47f, 4.27f, 0.02f, 6.03f)
                lineToRelative(7.17f, 7.75f)
                curveToRelative(0.69f, 0.78f, 1.69f, 1.23f, 2.73f, 1.23f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.05f, -0.0f, 2.04f, -0.45f, 2.73f, -1.23f)
                lineToRelative(7.15f, -7.78f)
                curveToRelative(1.46f, -1.74f, 1.46f, -4.26f, -0.02f, -6.02f)
                close()
                moveTo(13.99f, 1.9f)
                lineToRelative(7.15f, 7.75f)
                curveToRelative(0.5f, 0.59f, 0.78f, 1.31f, 0.85f, 2.03f)
                lineToRelative(-9.49f, 2.79f)
                lineTo(12.5f, 1.05f)
                curveToRelative(0.57f, 0.11f, 1.09f, 0.4f, 1.49f, 0.85f)
                close()
                moveTo(2.85f, 9.65f)
                lineTo(10.01f, 1.9f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.39f, -0.44f, 0.92f, -0.73f, 1.49f, -0.84f)
                lineTo(11.5f, 14.46f)
                lineTo(2.01f, 11.68f)
                curveToRelative(0.06f, -0.73f, 0.34f, -1.44f, 0.84f, -2.02f)
                close()
                moveTo(10.03f, 22.11f)
                lineTo(2.87f, 14.36f)
                curveToRelative(-0.41f, -0.48f, -0.67f, -1.04f, -0.79f, -1.62f)
                lineToRelative(9.43f, 2.77f)
                verticalLineToRelative(7.45f)
                curveToRelative(-0.56f, -0.11f, -1.08f, -0.41f, -1.47f, -0.84f)
                close()
                moveTo(21.16f, 14.34f)
                lineToRelative(-7.14f, 7.77f)
                curveToRelative(-0.4f, 0.45f, -0.93f, 0.74f, -1.51f, 0.85f)
                verticalLineToRelative(-7.45f)
                lineToRelative(9.43f, -2.77f)
                curveToRelative(-0.12f, 0.58f, -0.38f, 1.13f, -0.77f, 1.61f)
                close()
            }
        }.also { _DiceD8 = it}
