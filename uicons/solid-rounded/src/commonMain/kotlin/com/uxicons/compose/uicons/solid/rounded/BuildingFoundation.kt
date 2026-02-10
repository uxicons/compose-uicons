package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingFoundation: ImageVector? = null

val Icons.Sr.BuildingFoundation: ImageVector
    get() = _BuildingFoundation ?: UXIcon(name = "BuildingFoundation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.34f)
                lineToRelative(-6f, -3.14f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.2f)
                lineToRelative(-6f, 3.14f)
                verticalLineToRelative(-4.34f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15.91f)
                curveToRelative(0f, 1.87f, 1.03f, 3.57f, 2.68f, 4.43f)
                lineToRelative(4f, 2.09f)
                curveToRelative(0.72f, 0.38f, 1.52f, 0.57f, 2.31f, 0.57f)
                reflectiveCurveToRelative(1.59f, -0.19f, 2.31f, -0.57f)
                lineToRelative(4f, -2.09f)
                curveToRelative(1.66f, -0.86f, 2.69f, -2.56f, 2.69f, -4.43f)
                verticalLineToRelative(-15.91f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1f, -1.0f, -1f)
                close()
                moveTo(18.45f, 7.31f)
                lineTo(13f, 10.16f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(11f, 4.46f)
                verticalLineToRelative(5.7f)
                lineToRelative(-5.45f, -2.85f)
                lineToRelative(5.45f, -2.85f)
                close()
                moveTo(5f, 9.28f)
                lineTo(9.36f, 11.56f)
                lineTo(5f, 13.84f)
                close()
                moveTo(11f, 18.6f)
                curveToRelative(-0.13f, -0.05f, -0.27f, -0.08f, -0.39f, -0.15f)
                lineToRelative(-5.06f, -2.65f)
                lineToRelative(5.45f, -2.85f)
                close()
                moveTo(13.39f, 18.45f)
                curveToRelative(-0.12f, 0.07f, -0.26f, 0.1f, -0.39f, 0.15f)
                verticalLineToRelative(-5.64f)
                lineToRelative(5.45f, 2.85f)
                close()
                moveTo(19f, 13.84f)
                lineTo(14.64f, 11.56f)
                lineTo(19f, 9.28f)
                verticalLineToRelative(4.56f)
                close()
            }
        }.also { _BuildingFoundation = it}
