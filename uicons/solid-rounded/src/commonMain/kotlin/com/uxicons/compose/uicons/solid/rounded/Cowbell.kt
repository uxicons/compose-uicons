package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cowbell: ImageVector? = null

val Icons.Sr.Cowbell: ImageVector
    get() = _Cowbell ?: UXIcon(name = "Cowbell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.94f, 14.3f)
                lineToRelative(-1.28f, -6.18f)
                curveToRelative(-0.42f, -2.36f, -2.45f, -4.08f, -4.84f, -4.11f)
                curveToRelative(0.11f, -0.32f, 0.19f, -0.65f, 0.19f, -1.01f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.35f, 0.07f, 0.69f, 0.19f, 1.01f)
                curveToRelative(-2.39f, 0.04f, -4.42f, 1.75f, -4.84f, 4.11f)
                lineToRelative(-1.28f, 6.18f)
                curveToRelative(-0.21f, 1.17f, 0.11f, 2.36f, 0.87f, 3.27f)
                curveToRelative(0.76f, 0.91f, 1.88f, 1.43f, 3.07f, 1.43f)
                horizontalLineToRelative(14f)
                curveToRelative(1.19f, 0f, 2.31f, -0.52f, 3.07f, -1.43f)
                reflectiveCurveToRelative(1.08f, -2.1f, 0.87f, -3.27f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(8.14f, 21f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-0.45f, 1.72f, -2f, 3f, -3.86f, 3f)
                reflectiveCurveToRelative(-3.41f, -1.28f, -3.86f, -3f)
                close()
            }
        }.also { _Cowbell = it}
