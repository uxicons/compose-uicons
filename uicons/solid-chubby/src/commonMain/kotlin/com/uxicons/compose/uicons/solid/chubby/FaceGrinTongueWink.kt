package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceGrinTongueWink: ImageVector? = null

val Icons.Sc.FaceGrinTongueWink: ImageVector
    get() = _FaceGrinTongueWink ?: UXIcon(name = "FaceGrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.88f, -0.12f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.12f, -1f, -1f)
                close()
                moveTo(16f, 8f)
                curveToRelative(-0.88f, 0f, -1f, 0.12f, -1f, 1f)
                reflectiveCurveToRelative(0.12f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.12f, 1f, -1f)
                reflectiveCurveToRelative(-0.12f, -1f, -1f, -1f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(7f, 11.0f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 9f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.01f, -3f, 3f)
                reflectiveCurveToRelative(1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                close()
            }
        }.also { _FaceGrinTongueWink = it}
