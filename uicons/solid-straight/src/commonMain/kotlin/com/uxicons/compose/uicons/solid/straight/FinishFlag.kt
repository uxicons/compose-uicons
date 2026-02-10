package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FinishFlag: ImageVector? = null

val Icons.Ss.FinishFlag: ImageVector
    get() = _FinishFlag ?: UXIcon(name = "FinishFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.94f, 22.46f)
                lineToRelative(-4.06f, -11.21f)
                curveToRelative(-1.28f, -0.22f, -2.29f, 0.24f, -3.35f, 1.13f)
                curveToRelative(-0.67f, 0.5f, -1.36f, 1.02f, -2.1f, 1.29f)
                curveToRelative(-1.99f, 0.6f, -2.67f, 0.31f, -3.6f, 0.22f)
                lineToRelative(-2.82f, -7.55f)
                verticalLineToRelative(-1.34f)
                curveToRelative(1.03f, -0.03f, 2.09f, 0.1f, 3.25f, -0.23f)
                curveToRelative(0.43f, -0.15f, 0.97f, -0.61f, 1.5f, -1.06f)
                curveToRelative(0.65f, -0.56f, 1.32f, -1.13f, 2.08f, -1.41f)
                curveToRelative(1.98f, -0.58f, 3.03f, -0.17f, 3.92f, -0.04f)
                lineToRelative(7.07f, 19.52f)
                lineToRelative(-1.88f, 0.68f)
                close()
                moveTo(24f, 5.0f)
                curveToRelative(-1.05f, -0.03f, -2.03f, 0.11f, -3.25f, -0.23f)
                curveToRelative(-0.43f, -0.15f, -0.97f, -0.61f, -1.5f, -1.06f)
                curveToRelative(-0.65f, -0.56f, -1.32f, -1.13f, -2.08f, -1.41f)
                curveToRelative(-1.98f, -0.58f, -3.03f, -0.17f, -3.92f, -0.04f)
                lineToRelative(-0.18f, 0.51f)
                lineToRelative(3.83f, 10.6f)
                curveToRelative(1.54f, 0.91f, 3.53f, 0.67f, 4.28f, 0.54f)
                lineToRelative(2.82f, -7.55f)
                verticalLineToRelative(-1.35f)
                close()
                moveTo(8.75f, 14.69f)
                lineTo(6.18f, 21.78f)
                lineTo(8.06f, 22.46f)
                lineTo(10.94f, 14.52f)
                lineTo(10.54f, 13.41f)
                curveToRelative(-0.25f, 0.16f, -1.44f, 1.05f, -1.79f, 1.28f)
                close()
            }
        }.also { _FinishFlag = it}
