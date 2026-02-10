package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screw: ImageVector? = null

val Icons.Rr.Screw: ImageVector
    get() = _Screw ?: UXIcon(name = "Screw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.23f, 0f)
                horizontalLineToRelative(-6.46f)
                curveToRelative(-1.53f, 0f, -2.77f, 1.24f, -2.77f, 2.77f)
                curveToRelative(0f, 0.74f, 0.29f, 1.44f, 0.81f, 1.96f)
                lineToRelative(2.19f, 2.19f)
                reflectiveCurveToRelative(-0.03f, 12.36f, 0.01f, 12.5f)
                curveToRelative(0.02f, 1.31f, 0.53f, 2.54f, 1.46f, 3.46f)
                lineToRelative(0.83f, 0.83f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(0.83f, -0.83f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.54f)
                lineTo(15.0f, 6.91f)
                lineToRelative(2.19f, -2.19f)
                curveToRelative(0.52f, -0.52f, 0.81f, -1.22f, 0.81f, -1.96f)
                curveToRelative(0f, -1.53f, -1.24f, -2.77f, -2.77f, -2.77f)
                close()
                moveTo(13f, 19.34f)
                curveToRelative(0f, 0.79f, -0.32f, 1.56f, -0.88f, 2.12f)
                lineToRelative(-0.12f, 0.12f)
                lineToRelative(-0.12f, -0.12f)
                curveToRelative(-0.51f, -0.51f, -0.81f, -1.21f, -0.86f, -1.93f)
                lineToRelative(1.98f, -2.05f)
                verticalLineToRelative(1.87f)
                close()
                moveTo(13f, 14.6f)
                lineToRelative(-2f, 2.07f)
                verticalLineToRelative(-2.75f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(2.68f)
                close()
                moveTo(13f, 9.09f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-4.09f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.09f)
                close()
                moveTo(15.78f, 3.31f)
                lineToRelative(-1.69f, 1.69f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1.69f, -1.69f)
                curveToRelative(-0.14f, -0.14f, -0.23f, -0.34f, -0.23f, -0.54f)
                curveToRelative(0f, -0.42f, 0.34f, -0.77f, 0.77f, -0.77f)
                horizontalLineToRelative(6.46f)
                curveToRelative(0.42f, 0f, 0.77f, 0.34f, 0.77f, 0.77f)
                curveToRelative(0f, 0.2f, -0.08f, 0.4f, -0.23f, 0.54f)
                close()
            }
        }.also { _Screw = it}
