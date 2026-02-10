package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThunderstormRisk: ImageVector? = null

val Icons.Bs.ThunderstormRisk: ImageVector
    get() = _ThunderstormRisk ?: UXIcon(name = "ThunderstormRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 24f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                lineToRelative(-7f, 12f)
                close()
                moveTo(13f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(24.0f, 12.29f)
                curveToRelative(-0.02f, 3.38f, -2.22f, 6.25f, -5.26f, 7.29f)
                lineToRelative(-1.56f, -2.68f)
                curveToRelative(2.17f, -0.43f, 3.81f, -2.34f, 3.82f, -4.63f)
                curveToRelative(-0.01f, -2.21f, -1.59f, -4.13f, -3.76f, -4.57f)
                lineToRelative(-0.81f, -0.17f)
                lineToRelative(-0.29f, -0.78f)
                curveToRelative(-0.83f, -2.25f, -3.0f, -3.75f, -5.38f, -3.75f)
                curveToRelative(-3.17f, 0f, -5.75f, 2.58f, -5.75f, 5.75f)
                curveToRelative(0f, 0.44f, 0.05f, 0.87f, 0.16f, 1.34f)
                lineToRelative(0.25f, 1.06f)
                lineToRelative(-0.93f, 0.57f)
                curveToRelative(-0.89f, 0.54f, -1.48f, 1.54f, -1.48f, 2.49f)
                curveToRelative(0f, 1.54f, 1.04f, 2.8f, 2.32f, 2.8f)
                horizontalLineToRelative(1.45f)
                lineToRelative(-1.74f, 2.98f)
                curveToRelative(-2.8f, -0.17f, -5.03f, -2.69f, -5.03f, -5.78f)
                curveToRelative(0f, -1.65f, 0.79f, -3.29f, 2.06f, -4.42f)
                curveToRelative(-0.04f, -0.35f, -0.07f, -0.7f, -0.07f, -1.04f)
                curveTo(2f, 3.92f, 5.92f, 0f, 10.75f, 0f)
                curveToRelative(3.37f, 0f, 6.44f, 1.97f, 7.88f, 4.97f)
                curveToRelative(3.08f, 0.98f, 5.26f, 4.07f, 5.36f, 7.33f)
                close()
            }
        }.also { _ThunderstormRisk = it}
