package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Tr.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 0.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(23.5f, 11.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(19.32f, 8.18f)
                curveToRelative(0.09f, 0f, 0.17f, -0.02f, 0.25f, -0.07f)
                lineToRelative(2.58f, -1.52f)
                curveToRelative(0.24f, -0.14f, 0.32f, -0.45f, 0.18f, -0.69f)
                curveToRelative(-0.14f, -0.24f, -0.45f, -0.32f, -0.69f, -0.18f)
                lineToRelative(-2.58f, 1.52f)
                curveToRelative(-0.24f, 0.14f, -0.32f, 0.45f, -0.18f, 0.69f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.25f, 0.43f, 0.25f)
                close()
                moveTo(22.16f, 17.41f)
                lineTo(19.57f, 15.89f)
                curveToRelative(-0.23f, -0.14f, -0.54f, -0.06f, -0.69f, 0.18f)
                curveToRelative(-0.14f, 0.24f, -0.06f, 0.54f, 0.18f, 0.69f)
                lineToRelative(2.58f, 1.52f)
                curveToRelative(0.23f, 0.14f, 0.54f, 0.06f, 0.69f, -0.18f)
                curveToRelative(0.14f, -0.24f, 0.06f, -0.54f, -0.18f, -0.69f)
                close()
                moveTo(16.75f, 19.07f)
                curveToRelative(-0.14f, -0.24f, -0.45f, -0.32f, -0.69f, -0.18f)
                curveToRelative(-0.24f, 0.14f, -0.32f, 0.45f, -0.18f, 0.69f)
                lineToRelative(1.52f, 2.58f)
                curveToRelative(0.14f, 0.24f, 0.45f, 0.32f, 0.69f, 0.18f)
                curveToRelative(0.24f, -0.14f, 0.32f, -0.45f, 0.18f, -0.69f)
                close()
                moveTo(18.1f, 1.67f)
                curveToRelative(-0.23f, -0.14f, -0.54f, -0.06f, -0.69f, 0.18f)
                lineToRelative(-1.52f, 2.58f)
                curveToRelative(-0.14f, 0.24f, -0.06f, 0.54f, 0.18f, 0.69f)
                curveToRelative(0.23f, 0.14f, 0.54f, 0.06f, 0.69f, -0.18f)
                lineToRelative(1.52f, -2.58f)
                curveToRelative(0.14f, -0.24f, 0.06f, -0.54f, -0.18f, -0.69f)
                close()
            }
        }.also { _HalfLoading = it}
