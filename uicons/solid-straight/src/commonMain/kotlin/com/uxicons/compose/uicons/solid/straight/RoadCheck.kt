package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadCheck: ImageVector? = null

val Icons.Ss.RoadCheck: ImageVector
    get() = _RoadCheck ?: UXIcon(name = "RoadCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -1.35f, 0.34f, -2.63f, 0.94f, -3.75f)
                verticalLineToRelative(-4.25f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.81f)
                curveToRelative(1.38f, -1.13f, 3.14f, -1.81f, 5.06f, -1.81f)
                curveToRelative(1.33f, 0f, 2.59f, 0.33f, 3.7f, 0.91f)
                lineToRelative(-1.48f, -8.43f)
                curveToRelative(-0.25f, -1.44f, -1.5f, -2.48f, -2.96f, -2.48f)
                horizontalLineToRelative(-10.64f)
                curveToRelative(-1.46f, 0f, -2.7f, 1.04f, -2.96f, 2.48f)
                lineToRelative(-3.77f, 21.52f)
                horizontalLineToRelative(12.83f)
                curveToRelative(-1.67f, -1.47f, -2.73f, -3.61f, -2.73f, -6f)
                close()
                moveTo(10.94f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _RoadCheck = it}
