package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSankey: ImageVector? = null

val Icons.Rc.DiagramSankey: ImageVector
    get() = _DiagramSankey ?: UXIcon(name = "DiagramSankey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.41f)
                curveToRelative(0.81f, -1.41f, 2.03f, -2.99f, 4.2f, -3.92f)
                curveToRelative(0.12f, -0.05f, 0.26f, -0.08f, 0.4f, -0.08f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-1.39f, 0.65f, -2.39f, 1.69f, -3.33f, 3.47f)
                curveToRelative(-0.17f, 0.33f, -0.51f, 0.53f, -0.88f, 0.53f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 21f)
                horizontalLineToRelative(-9.84f)
                curveToRelative(-2.54f, -0.84f, -4.2f, -2.54f, -5.22f, -5.34f)
                curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.94f, -0.66f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.32f)
                curveToRelative(1.28f, 3.06f, 3.37f, 5.01f, 6.38f, 5.95f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.3f, 0.05f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.32f)
                curveToRelative(1.28f, 3.06f, 3.37f, 5.01f, 6.38f, 5.95f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.3f, 0.05f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5.84f)
                curveToRelative(-2.1f, -0.69f, -3.6f, -1.99f, -4.62f, -4f)
                horizontalLineToRelative(10.47f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _DiagramSankey = it}
