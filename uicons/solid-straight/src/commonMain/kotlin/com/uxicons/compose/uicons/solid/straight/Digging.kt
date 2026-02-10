package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Digging: ImageVector? = null

val Icons.Ss.Digging: ImageVector
    get() = _Digging ?: UXIcon(name = "Digging") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.38f, 24f)
                lineToRelative(3.09f, -4.42f)
                lineTo(0.94f, 10.32f)
                lineToRelative(1.13f, -1.65f)
                lineToRelative(2.74f, 1.87f)
                lineToRelative(0.92f, -2.56f)
                curveToRelative(0.29f, -0.81f, 0.91f, -1.45f, 1.71f, -1.77f)
                curveToRelative(0.8f, -0.32f, 1.69f, -0.28f, 2.46f, 0.1f)
                lineToRelative(0.47f, 0.18f)
                curveToRelative(1.15f, 0.57f, 2.02f, 1.55f, 2.46f, 2.76f)
                lineToRelative(1.43f, 4.14f)
                lineToRelative(-1.88f, 0.68f)
                lineToRelative(-1.42f, -4.14f)
                curveToRelative(-0.04f, -0.11f, -0.09f, -0.2f, -0.14f, -0.3f)
                lineToRelative(-1.41f, 3.92f)
                lineToRelative(6.23f, 4.39f)
                lineToRelative(3.47f, -4.96f)
                lineToRelative(4.96f, 11.02f)
                horizontalLineToRelative(-12.67f)
                close()
                moveTo(11.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(2.15f)
                lineToRelative(2.83f, -7.88f)
                lineToRelative(-1.73f, -1.18f)
                lineTo(0f, 24f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.44f)
                lineToRelative(-2f, -1.37f)
                verticalLineToRelative(5.81f)
                close()
            }
        }.also { _Digging = it}
