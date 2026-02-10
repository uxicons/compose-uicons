package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneCheck: ImageVector? = null

val Icons.Sr.PlaneCheck: ImageVector
    get() = _PlaneCheck ?: UXIcon(name = "PlaneCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.68f, 17.71f)
                lineTo(18.98f, 20.33f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
                reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
                lineToRelative(2.71f, -2.62f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(11.09f, 22.03f)
                lineTo(7.79f, 23.87f)
                curveToRelative(-0.64f, 0.23f, -1.35f, 0.14f, -1.9f, -0.25f)
                reflectiveCurveToRelative(-0.89f, -1.02f, -0.89f, -1.7f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0f, -0.82f, 0.41f, -1.58f, 1.1f, -2.04f)
                lineToRelative(1.9f, -1.42f)
                verticalLineToRelative(-4.55f)
                lineToRelative(-4.45f, 1.44f)
                curveToRelative(-0.82f, 0.28f, -1.73f, 0.14f, -2.43f, -0.36f)
                curveToRelative(-0.7f, -0.5f, -1.12f, -1.32f, -1.12f, -2.18f)
                curveToRelative(0f, -1.1f, 0.6f, -2.11f, 1.55f, -2.62f)
                lineToRelative(6.45f, -3.77f)
                verticalLineToRelative(-3.42f)
                curveToRelative(0f, -0.88f, 0.39f, -1.72f, 1.06f, -2.29f)
                curveToRelative(0.55f, -0.46f, 1.23f, -0.7f, 1.94f, -0.7f)
                curveToRelative(0.71f, 0.0f, 1.4f, 0.24f, 1.94f, 0.7f)
                curveToRelative(0.67f, 0.57f, 1.06f, 1.4f, 1.06f, 2.29f)
                verticalLineToRelative(3.42f)
                lineToRelative(6.45f, 3.77f)
                curveToRelative(0.2f, 0.11f, 0.39f, 0.25f, 0.56f, 0.4f)
                curveToRelative(-0.93f, -0.38f, -1.95f, -0.59f, -3.01f, -0.59f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 1.47f, 0.4f, 2.85f, 1.09f, 4.03f)
                close()
            }
        }.also { _PlaneCheck = it}
