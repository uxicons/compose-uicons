package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLuggage: ImageVector? = null

val Icons.Bs.PersonLuggage: ImageVector
    get() = _PersonLuggage ?: UXIcon(name = "PersonLuggage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20.61f, 16.68f)
                lineToRelative(-2.54f, -1.65f)
                lineToRelative(0.3f, -2.44f)
                lineToRelative(3.0f, 1.72f)
                lineToRelative(1.49f, -2.6f)
                lineToRelative(-4.14f, -2.37f)
                curveToRelative(-0.02f, -0.8f, -0.3f, -1.57f, -0.84f, -2.18f)
                curveToRelative(-0.65f, -0.73f, -1.58f, -1.15f, -2.56f, -1.15f)
                curveToRelative(-0.95f, 0f, -1.86f, 0.4f, -2.5f, 1.1f)
                lineToRelative(-3.75f, 4.79f)
                lineToRelative(2.37f, 1.85f)
                lineToRelative(2.01f, -2.58f)
                lineToRelative(-0.58f, 4.08f)
                lineToRelative(5.49f, 3.56f)
                lineToRelative(2.92f, 5.1f)
                lineToRelative(2.6f, -1.49f)
                lineToRelative(-3.28f, -5.73f)
                close()
                moveTo(11.45f, 24f)
                horizontalLineToRelative(3.05f)
                lineToRelative(0.8f, -4.92f)
                lineToRelative(-2.71f, -1.81f)
                lineToRelative(-1.15f, 6.72f)
                close()
                moveTo(5f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(4.12f, 12.79f)
                lineTo(0.41f, 17.55f)
                curveToRelative(-0.66f, 0.87f, -0.5f, 2.12f, 0.37f, 2.79f)
                lineToRelative(0.46f, 0.36f)
                curveToRelative(0.54f, -1.56f, 2.02f, -2.7f, 3.76f, -2.7f)
                curveToRelative(0.99f, 0f, 1.88f, 0.37f, 2.58f, 0.96f)
                lineToRelative(2.96f, -3.76f)
                lineToRelative(-3.59f, -2.79f)
                curveToRelative(-0.88f, -0.68f, -2.15f, -0.51f, -2.82f, 0.37f)
                close()
            }
        }.also { _PersonLuggage = it}
