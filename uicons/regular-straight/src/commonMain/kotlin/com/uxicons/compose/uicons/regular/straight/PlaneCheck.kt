package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneCheck: ImageVector? = null

val Icons.Rs.PlaneCheck: ImageVector
    get() = _PlaneCheck ?: UXIcon(name = "PlaneCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 12.65f)
                verticalLineToRelative(0.97f)
                lineToRelative(7f, -2.3f)
                verticalLineToRelative(6.97f)
                lineToRelative(-2.55f, 1.69f)
                curveToRelative(-0.28f, 0.19f, -0.45f, 0.5f, -0.45f, 0.83f)
                verticalLineToRelative(0.49f)
                lineToRelative(3.37f, -1.3f)
                curveToRelative(0.2f, 0.64f, 0.47f, 1.25f, 0.81f, 1.82f)
                lineToRelative(-6.18f, 2.35f)
                verticalLineToRelative(-3.36f)
                curveToRelative(0f, -1.01f, 0.51f, -1.95f, 1.34f, -2.5f)
                lineToRelative(1.66f, -1.1f)
                verticalLineToRelative(-3.13f)
                lineToRelative(-7f, 2.3f)
                verticalLineToRelative(-3.73f)
                curveToRelative(0f, -1.1f, 0.6f, -2.11f, 1.56f, -2.63f)
                lineToRelative(5.44f, -3.37f)
                verticalLineToRelative(-3.64f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                verticalLineToRelative(3.64f)
                lineToRelative(3.91f, 2.38f)
                curveToRelative(-0.97f, 0.07f, -1.9f, 0.29f, -2.75f, 0.66f)
                lineToRelative(-3.15f, -1.92f)
                verticalLineToRelative(-4.76f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.76f)
                lineToRelative(-6.43f, 3.99f)
                curveToRelative(-0.37f, 0.2f, -0.57f, 0.54f, -0.57f, 0.91f)
                close()
                moveTo(16.88f, 17.84f)
                lineTo(15.45f, 16.45f)
                lineTo(14.05f, 17.89f)
                lineTo(15.74f, 19.52f)
                curveToRelative(0.31f, 0.31f, 0.73f, 0.47f, 1.14f, 0.47f)
                curveToRelative(0.41f, 0f, 0.82f, -0.15f, 1.12f, -0.46f)
                lineToRelative(2.94f, -2.86f)
                lineToRelative(-1.39f, -1.44f)
                lineToRelative(-2.68f, 2.6f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(22f, 17.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                close()
            }
        }.also { _PlaneCheck = it}
