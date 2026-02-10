package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Bs.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.68f, 2.59f)
                lineTo(12f, 0.04f)
                lineTo(4.32f, 2.59f)
                curveToRelative(-1.39f, 0.46f, -2.32f, 1.75f, -2.32f, 3.21f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
                lineToRelative(0.98f, 0.49f)
                lineToRelative(1.02f, -0.41f)
                curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
                lineTo(22f, 5.8f)
                curveToRelative(0f, -1.46f, -0.93f, -2.75f, -2.32f, -3.21f)
                close()
                moveTo(19f, 5.8f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(-5.5f)
                lineTo(13.5f, 3.7f)
                lineToRelative(5.24f, 1.74f)
                curveToRelative(0.16f, 0.05f, 0.27f, 0.2f, 0.27f, 0.36f)
                close()
                moveTo(5.27f, 5.44f)
                lineToRelative(5.23f, -1.74f)
                verticalLineToRelative(6.3f)
                lineTo(5f, 10.0f)
                lineTo(5f, 5.8f)
                curveToRelative(0f, -0.17f, 0.11f, -0.31f, 0.27f, -0.36f)
                close()
                moveTo(5.1f, 13.0f)
                horizontalLineToRelative(5.4f)
                verticalLineToRelative(6.76f)
                curveToRelative(-2.07f, -1.32f, -4.87f, -3.65f, -5.4f, -6.76f)
                close()
                moveTo(13.5f, 19.96f)
                verticalLineToRelative(-6.96f)
                horizontalLineToRelative(5.43f)
                curveToRelative(-0.48f, 3.6f, -3.36f, 5.82f, -5.43f, 6.96f)
                close()
            }
        }.also { _ShieldDividedFour = it}
