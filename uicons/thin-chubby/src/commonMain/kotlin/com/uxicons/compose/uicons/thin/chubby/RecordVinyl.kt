package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RecordVinyl: ImageVector? = null

val Icons.Tc.RecordVinyl: ImageVector
    get() = _RecordVinyl ?: UXIcon(name = "RecordVinyl") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.08f, 0f, -9.97f, -2.9f, -9.97f, -10f)
                reflectiveCurveTo(4.92f, 2f, 12f, 2f)
                reflectiveCurveToRelative(9.97f, 2.9f, 9.97f, 10f)
                reflectiveCurveToRelative(-2.89f, 10f, -9.97f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.43f)
                curveToRelative(-1.96f, 0f, -4.56f, 0.47f, -4.56f, 4.57f)
                curveToRelative(0f, 4.05f, 2.44f, 4.57f, 4.56f, 4.57f)
                curveToRelative(1.96f, 0f, 4.56f, -0.47f, 4.56f, -4.57f)
                curveToRelative(0f, -4.05f, -2.44f, -4.57f, -4.56f, -4.57f)
                close()
                moveTo(12f, 15.57f)
                curveToRelative(-2.2f, 0f, -3.56f, -0.6f, -3.56f, -3.57f)
                reflectiveCurveToRelative(1.42f, -3.57f, 3.56f, -3.57f)
                curveToRelative(2.2f, 0f, 3.56f, 0.6f, 3.56f, 3.57f)
                reflectiveCurveToRelative(-1.42f, 3.57f, -3.56f, 3.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12.0f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _RecordVinyl = it}
