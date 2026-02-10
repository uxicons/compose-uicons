package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurlingIron: ImageVector? = null

val Icons.Rr.CurlingIron: ImageVector
    get() = _CurlingIron ?: UXIcon(name = "CurlingIron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 3.5f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.03f, -2.48f)
                curveToRelative(-1.37f, -1.36f, -3.58f, -1.36f, -4.95f, 0f)
                lineToRelative(-8.03f, 8.03f)
                verticalLineToRelative(-8.05f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8.29f)
                curveToRelative(-2.13f, -0.65f, -4.51f, -0.1f, -6.11f, 1.51f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.94f, -0.94f, 2.29f, -1.34f, 3.57f, -1.14f)
                lineToRelative(-5.62f, 5.62f)
                curveToRelative(-1.66f, 1.59f, -1.65f, 4.41f, 0f, 6.05f)
                curveToRelative(1.67f, 1.67f, 4.46f, 1.66f, 6.05f, 0f)
                lineToRelative(6.2f, -6.2f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.28f, -1.28f)
                lineToRelative(8.61f, -8.61f)
                curveToRelative(0.66f, -0.66f, 1.03f, -1.54f, 1.03f, -2.48f)
                close()
                moveTo(5.88f, 21.34f)
                curveToRelative(-0.86f, 0.86f, -2.36f, 0.86f, -3.23f, 0f)
                curveToRelative(-0.89f, -0.85f, -0.88f, -2.38f, 0f, -3.22f)
                lineToRelative(6.2f, -6.2f)
                lineToRelative(3.23f, 3.23f)
                close()
                moveTo(21.56f, 4.56f)
                lineTo(12.94f, 13.18f)
                lineTo(10.82f, 11.05f)
                lineTo(19.43f, 2.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                curveToRelative(0.58f, 0.56f, 0.58f, 1.56f, 0f, 2.12f)
                close()
            }
        }.also { _CurlingIron = it}
