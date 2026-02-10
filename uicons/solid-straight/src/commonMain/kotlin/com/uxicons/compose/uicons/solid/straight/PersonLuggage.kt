package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLuggage: ImageVector? = null

val Icons.Ss.PersonLuggage: ImageVector
    get() = _PersonLuggage ?: UXIcon(name = "PersonLuggage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21.08f, 17.59f)
                lineToRelative(2.83f, 5.35f)
                lineToRelative(-1.77f, 0.94f)
                lineToRelative(-2.59f, -4.9f)
                lineToRelative(-6.16f, -4.11f)
                lineToRelative(0.78f, -5.24f)
                lineToRelative(-3.26f, 4.06f)
                lineToRelative(-1.56f, -1.25f)
                lineToRelative(3.97f, -4.95f)
                curveToRelative(0.76f, -0.95f, 1.9f, -1.49f, 3.12f, -1.49f)
                curveToRelative(0f, 0f, 1.55f, -0.08f, 2.12f, 0.58f)
                reflectiveCurveToRelative(0.59f, 1.42f, 0.47f, 2.28f)
                lineToRelative(-0.16f, 1.12f)
                lineToRelative(5.09f, 2.91f)
                lineToRelative(-0.99f, 1.74f)
                lineToRelative(-4.41f, -2.52f)
                lineToRelative(-0.5f, 3.47f)
                lineToRelative(3.02f, 2.02f)
                close()
                moveTo(12.63f, 24f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.9f, -5.37f)
                lineToRelative(-1.8f, -1.2f)
                lineToRelative(-1.14f, 6.57f)
                close()
                moveTo(3f, 22f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(5f, 18f)
                curveToRelative(1.08f, 0f, 2.05f, 0.43f, 2.77f, 1.13f)
                lineToRelative(2.75f, -3.56f)
                lineToRelative(-3.12f, -2.42f)
                curveToRelative(-0.59f, -0.46f, -1.34f, -0.66f, -2.08f, -0.56f)
                curveToRelative(-0.75f, 0.1f, -1.41f, 0.48f, -1.85f, 1.07f)
                lineToRelative(-2.91f, 3.72f)
                curveToRelative(-0.92f, 1.21f, -0.69f, 2.96f, 0.51f, 3.89f)
                curveToRelative(0.34f, -1.86f, 1.97f, -3.28f, 3.93f, -3.28f)
                close()
            }
        }.also { _PersonLuggage = it}
