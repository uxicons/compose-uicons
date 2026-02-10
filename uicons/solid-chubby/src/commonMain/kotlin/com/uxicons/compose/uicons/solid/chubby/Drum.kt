package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Sc.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 17.81f)
                curveToRelative(1.1f, 0.13f, 2.14f, 0.17f, 3f, 0.18f)
                verticalLineToRelative(5.0f)
                curveToRelative(-1.02f, -0.02f, -2.03f, -0.08f, -3f, -0.2f)
                close()
                moveTo(1f, 16.5f)
                curveToRelative(0f, 3.53f, 2.11f, 5.17f, 5f, 5.92f)
                verticalLineToRelative(-4.94f)
                curveToRelative(-1.85f, -0.42f, -3.67f, -1.19f, -5f, -2.56f)
                verticalLineToRelative(1.58f)
                close()
                moveTo(18f, 22.42f)
                curveToRelative(2.89f, -0.75f, 5f, -2.39f, 5f, -5.92f)
                verticalLineToRelative(-1.58f)
                curveToRelative(-1.33f, 1.37f, -3.15f, 2.14f, -5f, 2.56f)
                verticalLineToRelative(4.94f)
                close()
                moveTo(13f, 22.99f)
                curveToRelative(1.02f, -0.02f, 2.03f, -0.08f, 3f, -0.2f)
                verticalLineToRelative(-4.98f)
                curveToRelative(-1.1f, 0.13f, -2.14f, 0.17f, -3f, 0.18f)
                close()
                moveTo(15.8f, 12.13f)
                curveToRelative(-1.39f, 1.27f, -3.73f, 1.11f, -4.94f, -0.33f)
                curveToRelative(-1.27f, -1.39f, -1.11f, -3.73f, 0.33f, -4.94f)
                lineToRelative(4.23f, -3.7f)
                curveToRelative(-1.11f, -0.12f, -2.26f, -0.17f, -3.42f, -0.17f)
                curveToRelative(-5.44f, -0.0f, -11f, 0.77f, -11f, 6.5f)
                reflectiveCurveToRelative(5.56f, 6.5f, 11f, 6.5f)
                reflectiveCurveToRelative(11f, -0.77f, 11f, -6.5f)
                curveToRelative(0f, -1.23f, -0.27f, -2.22f, -0.72f, -3.03f)
                lineToRelative(-6.47f, 5.66f)
                close()
                moveTo(14.49f, 10.63f)
                lineTo(22.49f, 3.63f)
                curveToRelative(0.62f, -0.55f, 0.69f, -1.49f, 0.14f, -2.12f)
                curveToRelative(-0.55f, -0.62f, -1.49f, -0.69f, -2.12f, -0.14f)
                lineToRelative(-8f, 7f)
                curveToRelative(-0.62f, 0.55f, -0.69f, 1.49f, -0.14f, 2.12f)
                curveToRelative(0.55f, 0.62f, 1.5f, 0.69f, 2.12f, 0.14f)
                close()
            }
        }.also { _Drum = it}
