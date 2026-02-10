package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tombstone: ImageVector? = null

val Icons.Tr.Tombstone: ImageVector
    get() = _Tombstone ?: UXIcon(name = "Tombstone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.51f, 23f)
                horizontalLineToRelative(-1.51f)
                verticalLineToRelative(-13f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                verticalLineToRelative(13f)
                lineTo(0.51f, 23f)
                curveToRelative(-0.28f, -0.0f, -0.51f, 0.21f, -0.51f, 0.49f)
                reflectiveCurveToRelative(0.21f, 0.51f, 0.49f, 0.51f)
                horizontalLineToRelative(23.01f)
                curveToRelative(0.27f, 0f, 0.49f, -0.22f, 0.5f, -0.49f)
                curveToRelative(0.01f, -0.28f, -0.21f, -0.51f, -0.49f, -0.51f)
                close()
                moveTo(3f, 10f)
                curveTo(3f, 5.04f, 7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(13f)
                lineTo(3f, 23f)
                verticalLineToRelative(-13f)
                close()
                moveTo(16f, 11f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Tombstone = it}
