package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Memo: ImageVector? = null

val Icons.Rc.Memo: ImageVector
    get() = _Memo ?: UXIcon(name = "Memo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 5.05f, -0.88f, 9.05f, -0.91f, 9.22f)
                curveToRelative(-0.08f, 0.36f, -0.35f, 0.65f, -0.71f, 0.75f)
                curveToRelative(-0.15f, 0.04f, -3.73f, 1.04f, -7.38f, 1.04f)
                reflectiveCurveToRelative(-7.23f, -0.99f, -7.38f, -1.04f)
                curveToRelative(-0.35f, -0.1f, -0.63f, -0.39f, -0.71f, -0.75f)
                curveToRelative(-0.04f, -0.17f, -0.91f, -4.17f, -0.91f, -9.22f)
                reflectiveCurveToRelative(0.88f, -9.05f, 0.91f, -9.22f)
                curveToRelative(0.08f, -0.36f, 0.35f, -0.65f, 0.71f, -0.75f)
                curveToRelative(0.15f, -0.04f, 3.73f, -1.04f, 7.38f, -1.04f)
                reflectiveCurveToRelative(7.23f, 0.99f, 7.38f, 1.04f)
                curveToRelative(0.35f, 0.1f, 0.63f, 0.39f, 0.71f, 0.75f)
                curveToRelative(0.04f, 0.17f, 0.91f, 4.17f, 0.91f, 9.22f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -3.72f, -0.51f, -6.91f, -0.75f, -8.19f)
                curveToRelative(-1.13f, -0.27f, -3.71f, -0.81f, -6.25f, -0.81f)
                reflectiveCurveToRelative(-5.12f, 0.54f, -6.25f, 0.81f)
                curveToRelative(-0.24f, 1.28f, -0.75f, 4.46f, -0.75f, 8.19f)
                reflectiveCurveToRelative(0.51f, 6.91f, 0.75f, 8.19f)
                curveToRelative(1.13f, 0.27f, 3.71f, 0.81f, 6.25f, 0.81f)
                reflectiveCurveToRelative(5.12f, -0.54f, 6.25f, -0.81f)
                curveToRelative(0.24f, -1.28f, 0.75f, -4.46f, 0.75f, -8.19f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Memo = it}
