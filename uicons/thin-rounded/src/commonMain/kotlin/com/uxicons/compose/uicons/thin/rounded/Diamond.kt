package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Tr.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.29f, 5.78f)
                lineToRelative(-3.15f, -4.26f)
                curveToRelative(-0.68f, -0.95f, -1.79f, -1.52f, -2.96f, -1.52f)
                horizontalLineToRelative(-7.25f)
                reflectiveCurveToRelative(-0.01f, 0f, -0.01f, 0f)
                horizontalLineToRelative(-3.09f)
                curveToRelative(-1.17f, 0f, -2.28f, 0.57f, -2.95f, 1.51f)
                lineTo(0.67f, 5.78f)
                curveToRelative(-0.94f, 1.33f, -0.88f, 3.13f, 0.13f, 4.37f)
                lineToRelative(9.18f, 12.87f)
                curveToRelative(0.49f, 0.62f, 1.23f, 0.98f, 2.03f, 0.98f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.8f, 0f, 1.53f, -0.36f, 2.04f, -1f)
                lineToRelative(9.14f, -12.77f)
                curveToRelative(1.04f, -1.28f, 1.09f, -3.11f, 0.11f, -4.45f)
                close()
                moveTo(19.33f, 2.11f)
                lineToRelative(3.16f, 4.27f)
                curveToRelative(0.14f, 0.2f, 0.26f, 0.41f, 0.34f, 0.62f)
                horizontalLineToRelative(-5.97f)
                lineToRelative(-2.06f, -6f)
                horizontalLineToRelative(2.39f)
                curveToRelative(0.85f, 0f, 1.65f, 0.41f, 2.15f, 1.11f)
                close()
                moveTo(8.2f, 7f)
                lineToRelative(2.06f, -6f)
                horizontalLineToRelative(3.47f)
                lineToRelative(2.06f, 6f)
                horizontalLineToRelative(-7.6f)
                close()
                moveTo(15.84f, 8f)
                lineToRelative(-3.84f, 13.65f)
                lineToRelative(-3.84f, -13.65f)
                horizontalLineToRelative(7.68f)
                close()
                moveTo(4.67f, 2.1f)
                curveToRelative(0.49f, -0.69f, 1.3f, -1.1f, 2.15f, -1.1f)
                horizontalLineToRelative(2.39f)
                lineToRelative(-2.06f, 6f)
                lineTo(1.15f, 7f)
                curveToRelative(0.08f, -0.22f, 0.19f, -0.43f, 0.32f, -0.63f)
                lineToRelative(3.2f, -4.27f)
                close()
                moveTo(10.77f, 22.42f)
                lineTo(1.59f, 9.55f)
                curveToRelative(-0.37f, -0.45f, -0.56f, -1.0f, -0.59f, -1.55f)
                horizontalLineToRelative(6.12f)
                lineToRelative(4.17f, 14.82f)
                curveToRelative(-0.2f, -0.09f, -0.38f, -0.22f, -0.52f, -0.4f)
                close()
                moveTo(13.25f, 22.4f)
                curveToRelative(-0.14f, 0.18f, -0.33f, 0.32f, -0.53f, 0.41f)
                lineToRelative(4.17f, -14.81f)
                horizontalLineToRelative(6.12f)
                curveToRelative(-0.02f, 0.57f, -0.22f, 1.14f, -0.61f, 1.62f)
                lineToRelative(-9.14f, 12.78f)
                close()
            }
        }.also { _Diamond = it}
