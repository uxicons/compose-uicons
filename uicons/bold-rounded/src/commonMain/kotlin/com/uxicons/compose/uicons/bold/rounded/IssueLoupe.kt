package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IssueLoupe: ImageVector? = null

val Icons.Br.IssueLoupe: ImageVector
    get() = _IssueLoupe ?: UXIcon(name = "IssueLoupe") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 21.44f)
            lineToRelative(-5.51f, -5.51f)
            curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
            curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
            reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
            lineToRelative(5.51f, 5.51f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(10.01f, 17.0f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
            close()
            moveTo(11.5f, 14.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13f, 8.0f)
            curveToRelative(0f, 1.12f, -0.62f, 2.15f, -1.62f, 2.67f)
            curveToRelative(-0.26f, 0.14f, -0.35f, 0.2f, -0.38f, 0.23f)
            curveToRelative(0.0f, 0.0f, -0.0f, 0.04f, -0.0f, 0.11f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -1.35f, 0.91f, -1.83f, 1.46f, -2.11f)
            curveToRelative(0.34f, -0.17f, 0.54f, -0.51f, 0.54f, -0.89f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            close()
        }
    }.also { _IssueLoupe = it }
