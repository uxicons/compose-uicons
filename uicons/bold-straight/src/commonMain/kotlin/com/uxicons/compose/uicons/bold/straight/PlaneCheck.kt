package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneCheck: ImageVector? = null

val Icons.Bs.PlaneCheck: ImageVector
    get() = _PlaneCheck ?: UXIcon(name = "PlaneCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 20.44f)
                lineTo(18.75f, 20.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
                moveTo(24f, 12.58f)
                verticalLineToRelative(0.15f)
                curveToRelative(-1.47f, -1.67f, -3.61f, -2.73f, -6f, -2.73f)
                curveToRelative(-0.36f, 0f, -0.71f, 0.03f, -1.06f, 0.08f)
                lineToRelative(-3.94f, -2.2f)
                verticalLineToRelative(-3.88f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.88f)
                lineToRelative(-7.78f, 4.33f)
                curveToRelative(-0.14f, 0.08f, -0.23f, 0.22f, -0.23f, 0.36f)
                verticalLineToRelative(0.83f)
                lineToRelative(8f, -2.7f)
                verticalLineToRelative(3.43f)
                curveToRelative(-0.64f, 1.15f, -1f, 2.46f, -1f, 3.86f)
                curveToRelative(0f, 1.5f, 0.42f, 2.9f, 1.15f, 4.1f)
                lineToRelative(-5.14f, 1.9f)
                verticalLineToRelative(-2.3f)
                curveToRelative(0f, -0.81f, 0.4f, -1.56f, 1.07f, -2.01f)
                lineToRelative(0.93f, -0.62f)
                verticalLineToRelative(-4.18f)
                lineToRelative(-8f, 2.7f)
                verticalLineToRelative(-5.01f)
                curveToRelative(0f, -1.25f, 0.68f, -2.4f, 1.78f, -2.99f)
                lineToRelative(6.22f, -3.47f)
                verticalLineToRelative(-2.12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2.12f)
                lineToRelative(6.23f, 3.47f)
                curveToRelative(1.08f, 0.59f, 1.77f, 1.74f, 1.77f, 2.99f)
                close()
            }
        }.also { _PlaneCheck = it}
