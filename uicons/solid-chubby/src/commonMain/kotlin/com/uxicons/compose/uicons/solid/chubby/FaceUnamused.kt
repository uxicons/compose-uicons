package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceUnamused: ImageVector? = null

val Icons.Sc.FaceUnamused: ImageVector
    get() = _FaceUnamused ?: UXIcon(name = "FaceUnamused") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.3f, 0f, 2f, 1.03f, 2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15.7f, 17.71f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.38f, -1.41f, -0.01f)
                curveToRelative(-0.47f, -0.48f, -1.2f, -0.7f, -2.29f, -0.7f)
                reflectiveCurveToRelative(-1.82f, 0.22f, -2.29f, 0.7f)
                curveToRelative(-0.39f, 0.4f, -1.02f, 0.4f, -1.41f, 0.01f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.86f, -0.87f, 2.07f, -1.3f, 3.71f, -1.3f)
                reflectiveCurveToRelative(2.85f, 0.42f, 3.71f, 1.3f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                close()
                moveTo(16f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.3f, 0f, 2f, 1.03f, 2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FaceUnamused = it}
